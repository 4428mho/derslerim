package tr.com.hanifi.dal;

import tr.com.hanifi.core.ObjectHelper;
import tr.com.hanifi.interfaces.DALInterfaces;

import java.util.List;

public class MusteriDAL <MusteriContract> extends ObjectHelper implements DALInterfaces<MusteriContract> {
    @Override
    public void Insert(MusteriContract entity) {

    }

    @Override
    public List<MusteriContract> GetAll() {
        return null;
    }

    @Override
    public MusteriContract Delete(MusteriContract entity) {
        return null;
    }

    @Override
    public void Update(MusteriContract entity) {

    }

    @Override
    public List<MusteriContract> GetById(int id) {
        return null;
    }
}
