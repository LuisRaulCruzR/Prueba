package luis.refer.productapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import luis.refer.productapp.models.User;
import luis.refer.productapp.models.UserPrincipal;
import luis.refer.productapp.repositories.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired UserRepository userRepository;
	
	@Override 
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			User user = userRepository.findByUsername(username);
			
			if(user == null) {
				throw new UsernameNotFoundException("User not Found");
			}
			
			return new UserPrincipal(user);
	}

}
