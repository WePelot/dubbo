/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.example.config;

import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author hongcj
 * @version V1.0
 * @since 2018-01-05 14:24
 */
@Configuration
public class DruidDBConfig {
    //    private Logger logger = LoggerFactory.getLogger(DruidDBConfig.class);
    //
    //    @Value("${spring.datasource.url}")
    //    private String dbUrl;
    //
    //    @Value("${spring.datasource.username}")
    //    private String username;
    //
    //    @Value("${spring.datasource.password}")
    //    private String password;
    //
    //    @Value("${spring.datasource.driverClassName}")
    //    private String driverClassName;
    //
    //    @Value("${spring.datasource.initialSize}")
    //    private int initialSize;
    //
    //    @Value("${spring.datasource.minIdle}")
    //    private int minIdle;
    //
    //    @Value("${spring.datasource.maxActive}")
    //    private int maxActive;
    //
    //    @Value("${spring.datasource.maxWait}")
    //    private int maxWait;
    //
    //    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    //    private int timeBetweenEvictionRunsMillis;
    //
    //    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
    //    private int minEvictableIdleTimeMillis;
    //
    //    @Value("${spring.datasource.validationQuery}")
    //    private String validationQuery;
    //
    //    @Value("${spring.datasource.testWhileIdle}")
    //    private boolean testWhileIdle;
    //
    //    @Value("${spring.datasource.testOnBorrow}")
    //    private boolean testOnBorrow;
    //
    //    @Value("${spring.datasource.testOnReturn}")
    //    private boolean testOnReturn;
    //
    //    @Value("${spring.datasource.poolPreparedStatements}")
    //    private boolean poolPreparedStatements;
    //
    //    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
    //    private int maxPoolPreparedStatementPerConnectionSize;
    //
    //    @Value("${spring.datasource.filters}")
    //    private String filters;
    //
    //    @Value("{spring.datasource.connectionProperties}")
    //    private String connectionProperties;
    //
    //    @Value("{log-abandoned}")
    //    private boolean logAbandoned;
    //
    //    @Value("{remove-abandoned}")
    //    private boolean removeAbandoned;
    //    @Value("{spring.datasource.remove-abandoned-timeout}")
    //    private Integer removeAbandonedTimeout;
    //
    //    @Bean //声明其为Bean实例
    //    @Primary //在同样的DataSource中，首先使用被标注的DataSource
    //    public DataSource dataSource() {
    //        DruidDataSource datasource = new DruidDataSource();
    //
    //        datasource.setUrl(this.dbUrl);
    //        datasource.setUsername(username);
    //        datasource.setPassword(password);
    //        datasource.setDriverClassName(driverClassName);
    //
    //        //configuration
    //        datasource.setInitialSize(initialSize);
    //        datasource.setMinIdle(minIdle);
    //        datasource.setMaxActive(maxActive);
    //        datasource.setMaxWait(maxWait);
    //        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
    //        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
    //        datasource.setValidationQuery(validationQuery);
    //        datasource.setTestWhileIdle(testWhileIdle);
    //        datasource.setTestOnBorrow(testOnBorrow);
    //        datasource.setTestOnReturn(testOnReturn);
    //        datasource.setPoolPreparedStatements(poolPreparedStatements);
    //        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
    //        datasource.setLogAbandoned(logAbandoned);
    //        datasource.setRemoveAbandoned(removeAbandoned);
    //        datasource.setRemoveAbandonedTimeout(removeAbandonedTimeout);
    //        try {
    //            datasource.setFilters(filters);
    //        } catch (SQLException e) {
    //            logger.error("druid configuration initialization filter", e);
    //        }
    //        datasource.setConnectionProperties(connectionProperties);
    //
    //        return datasource;
    //    }
}