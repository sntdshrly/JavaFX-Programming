package com.example.db_connect.util;

import java.sql.SQLException;
import java.util.List;

public interface DaoService<T> {
    List<T> fetchAll() throws SQLException,ClassNotFoundException;
    int addData(T object) throws SQLException,ClassNotFoundException;
    int deleteData(T object) throws SQLException,ClassNotFoundException;
}
