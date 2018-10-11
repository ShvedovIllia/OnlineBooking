package badm.courts.entity.enums;

import org.springframework.security.core.GrantedAuthority;

public enum UserRoles implements GrantedAuthority{
	
	ROLE_ADMIN, ROLE_USER, ROLE_GUEST;

	@Override
	public String getAuthority() {
		return name();
	}

}
