package tr.com.hanifi.dal;

import tr.com.hanifi.core.ObjectHelper;
import tr.com.hanifi.interfaces.DALInterfaces;

import java.util.List;

public class KategoriDAL<KategoriContaract> extends ObjectHelper implements DALInterfaces<KategoriContaract> {

    @Override
    public void Insert(KategoriContaract entity) {

    }

    @Override
    public List<KategoriContaract> GetAll() {
        return null;
    }

    @Override
    public KategoriContaract Delete(KategoriContaract entity) {
        return null;
    }

    @Override
    public void Update(KategoriContaract entity) {

    }

    @Override
    public List<KategoriContaract> GetById(int id) {
        return null;
    }
}
