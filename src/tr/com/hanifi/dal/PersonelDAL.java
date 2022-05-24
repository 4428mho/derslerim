package tr.com.hanifi.dal;

import tr.com.hanifi.core.ObjectHelper;
import tr.com.hanifi.interfaces.DALInterfaces;
import tr.com.hanifi.types.PersonelConstract;

import java.util.List;

public class PersonelDAL<PersonelConstract> extends ObjectHelper implements DALInterfaces<PersonelConstract> {
    @Override
    public void Insert(PersonelConstract entity) {

    }

    @Override
    public List<PersonelConstract> GetAll() {
        return null;
    }

    @Override
    public PersonelConstract Delete(PersonelConstract entity) {
        return null;
    }

    @Override
    public void Update(PersonelConstract entity) {

    }

    @Override
    public List<PersonelConstract> GetById(int id) {
        return null;
    }
}
