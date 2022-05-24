package tr.com.hanifi.dal;

import tr.com.hanifi.core.ObjectHelper;
import tr.com.hanifi.interfaces.DALInterfaces;

import java.util.List;

public class AccountsDAL <AccountsContract>extends ObjectHelper implements DALInterfaces <AccountsContract> {
    @Override
    public void Insert(AccountsContract entity) {

    }

    @Override
    public List<AccountsContract> GetAll() {
        return null;
    }

    @Override
    public AccountsContract Delete(AccountsContract entity) {
        return null;
    }

    @Override
    public void Update(AccountsContract entity) {

    }

    @Override
    public List<AccountsContract> GetById(int id) {
        return null;
    }
}
