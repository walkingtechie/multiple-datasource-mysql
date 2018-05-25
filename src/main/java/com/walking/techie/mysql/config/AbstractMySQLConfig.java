package com.walking.techie.mysql.config;

import lombok.Data;

import javax.sql.DataSource;

@Data
public abstract class AbstractMySQLConfig {

  // MySQL DB Properties
  private String url, username, password;

  public abstract DataSource dataSource();
}
