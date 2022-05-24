package tr.com.hanifi.dal;

import tr.com.hanifi.core.ObjectHelper;
import tr.com.hanifi.interfaces.DALInterfaces;

import java.util.List;

public class SatisDAL <SatisConstract> extends ObjectHelper implements DALInterfaces<SatisConstract> {
    @Override
    public void Insert(SatisConstract entity) {

    }

    @Override
    public List<SatisConstract> GetAll() {
        return null;
    }

    @Override
    public SatisConstract Delete(SatisConstract entity) {
        return null;
    }

    @Override
    public void Update(SatisConstract entity) {

    }

    @Override
    public List<SatisConstract> GetById(int id) {
        return null;
    }
}
