package com.aaryan.Blogger.Helper;

import java.util.Collections;
import java.util.List;

import com.aaryan.Blogger.Domain.UserInfo;

public class AuthenticationAndLogin {

	public static int verifiedloginUser(List<UserInfo> userList,UserInfo user) {
			System.out.println("list:"+userList);
			System.out.println("user info"+user.getUsername()+user.getPassword());
	
		
			for(UserInfo u:userList) {
				if(user.getUsername().contentEquals(u.getUsername()) && user.getPassword().contentEquals(u.getPassword()))
					return u.getId();
			}
	
		return 0;
	}
	
	
}
