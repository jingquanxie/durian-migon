/**
 * Copyright(c) Micro Orange Technology Co.,Ltd
 * All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Micro Orange
 * Technology Co.,Ltd. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with Micro Orange.
 * For more information about Micro Orange, welcome to http://www.yaoyaoxing.com
 * <p>
 * Revision History:
 * Date		Version		Name				Description
 * 5/27/2016	1.0			TonyXie			Creation File
 */
package com.shelter.thks.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.shelter.thks.*"})
@EntityScan(basePackages = {"com.shelter.thks.*"})
@MapperScan(basePackages = {"com.shelter.thks.mapper","classpath:mapping/*.xml"})
public class DataConfiguration{
}
