package com.abc.service;

import com.abc.bean.Student;
import com.abc.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao dao;

    // 采用spring默认的事务提交方式, 发生运行时异常回滚, 发生受查异常提交
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addStudent(Student student) throws Exception {
        dao.insertStudent(student);
        if(true){
            throw new Exception("发生受查异常");
        }
        dao.insertStudent(student);
    }
}
