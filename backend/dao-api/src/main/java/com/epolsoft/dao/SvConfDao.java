package com.epolsoft.dao;


import com.epolsoft.sv_conf.SvConf;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface SvConfDao {

    @Select("SELECT name, value, desc FROM sv_conf")
    List<SvConf> findAll();

    @Select("SELECT name, value, desc FROM sv_conf WHERE name = #{name}")
    SvConf findByName(@Param("name") String name);

    @Insert("INSERT INTO sv_conf (name, value, desc) VALUES (#{svConf.name}, #{svConf.value}, #{svConf.desc})")
    void add(@Param("svConf") SvConf svConf);

    @Update("UPDATE sv_conf SET value = #{svConf.value}, desc = #{svConf.desc} WHERE name = #{svConf.name}")
    void update(@Param("svConf") SvConf svConf);

    @Delete("DELETE FROM sv_conf WHERE name = #{name}")
    void delete(@Param("name") String name);

}
