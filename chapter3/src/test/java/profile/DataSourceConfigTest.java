package profile;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zhaotian
 * @date 2018/11/1 9:32
 */
public class DataSourceConfigTest {
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = DataSourceConfig.class)
    @ActiveProfiles("dev")
    public static class DevDataSourceTest{
        @Autowired
        private DataSource dataSource;
        @Test
        public void shouldBeEmbeddedDataSource() {
            Assert.assertNotNull(dataSource);
            JdbcTemplate jdbcTemplate = new JdbcTemplate();
            List<String> results = jdbcTemplate.query("SELECT id,name FROM Things", new RowMapper<String>() {
                public String mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                    return resultSet.getLong("id") + ":" + resultSet.getString("name");
                }
            });
            Assert.assertEquals(1, results.size());
            Assert.assertEquals("1:A", results.get(0));
        }

        @RunWith(SpringJUnit4ClassRunner.class)
        @ContextConfiguration("classpath:dataSource-config.xml")
        @ActiveProfiles("prod")
        public static class ProductionDataSourceTest_XMLConfig {
            @Autowired(required=false)
            private DataSource dataSource;
            @Test
            public void shouldBeEmbeddedDatasource() {
                // should be null, because there isn't a datasource configured in JNDI
                Assert.assertNull(dataSource);
            }
        }
    }
}
