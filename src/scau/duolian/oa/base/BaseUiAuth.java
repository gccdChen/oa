package scau.duolian.oa.base;

import scau.duolian.oa.model.User;
import scau.duolian.oa.ui.UiLogin;
import android.os.Bundle;

public class BaseUiAuth extends BaseUi{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if(!isLogin()){
			forward(UiLogin.class);
		}
	}
	
	public User getUser() {
		// TODO Auto-generated method stub
		return ((BaseApp)getApplication()).owner;
	}
}
