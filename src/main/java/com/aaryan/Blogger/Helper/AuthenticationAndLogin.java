package com.aaryan.Blogger.Helper;

import java.util.Collections;
import java.util.List;

import com.aaryan.Blogger.Domain.UserInfo;

public class AuthenticationAndLogin {

	public int verifiedloginUser(List<UserInfo> userList,UserInfo user) {
		
			for(UserInfo u:userList) {
				if(user.getUsername()==u.getUsername() && user.getPassword()==u.getPassword())
					return u.getId();
			}
	
		return 0;
	}
	
	
}
