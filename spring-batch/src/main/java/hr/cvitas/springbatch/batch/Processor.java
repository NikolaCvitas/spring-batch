package hr.cvitas.springbatch.batch;

import hr.cvitas.springbatch.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> DEPT_NAMES = new HashMap<>();

    public Processor(){

        DEPT_NAMES.put("001","Tehnology");
        DEPT_NAMES.put("002","Research");
        DEPT_NAMES.put("003","Development");
    }

    @Override
    public User process(User user) throws Exception{

        //process dept code into description
        String deptCode = user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        user.setDate(new Date());




        return  user;
    }
}
