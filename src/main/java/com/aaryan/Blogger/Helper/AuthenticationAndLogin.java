package com.aaryan.Blogger.Helper;

import java.util.Collections;
import java.util.List;

import com.aaryan.Blogger.Domain.UserInfo;

public class AuthenticationAndLogin {

	public static int verifiedloginUser(List<UserInfo> userList,UserInfo user) {
			
		if(userList==null)
				return 0;
		
			for(UserInfo u:userList) {
				if(user.getUsername()==u.getUsername() && user.getPassword()==u.getPassword())
					return u.getId();
			}
	
		return 0;
	}
	
	
}
