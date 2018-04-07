package com.xgh.hbase;

import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final String TABLE_NAME = "user";
    private static final byte[] CF_INFO = Bytes.toBytes("cf1");

    private static final byte[] qName = Bytes.toBytes("name");
    @Autowired
    private HbaseTemplate hbaseTemplate;


    User insert() {
        return hbaseTemplate.execute(TABLE_NAME, table -> {
            Put put = new Put(Bytes.toBytes("003"));
            User user = new User();
            user.setName("marry");
            put.addColumn(CF_INFO, qName, Bytes.toBytes(user.getName()));
            table.put(put);
            return user;
        });
    }
}
