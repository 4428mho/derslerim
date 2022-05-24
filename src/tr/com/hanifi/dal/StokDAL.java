package tr.com.hanifi.dal;

import tr.com.hanifi.core.ObjectHelper;
import tr.com.hanifi.interfaces.DALInterfaces;

import java.util.List;

public class StokDAL <StokConstract>extends ObjectHelper implements DALInterfaces<StokConstract> {
    @Override
    public void Insert(StokConstract entity) {

    }

    @Override
    public List<StokConstract> GetAll() {
        return null;
    }

    @Override
    public StokConstract Delete(StokConstract entity) {
        return null;
    }

    @Override
    public void Update(StokConstract entity) {

    }

    @Override
    public List<StokConstract> GetById(int id) {
        return null;
    }
}
