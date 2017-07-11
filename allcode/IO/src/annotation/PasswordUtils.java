package annotation;

import java.util.List;

public class PasswordUtils {
@UseCase(id = 47 ,description = "Password must contain at least one numeric")
public boolean validatePassord(String password)
{
	return (password.matches("\\w*\\d\\w*"));
}
@UseCase(id = 49 , description = "new password cant equals previously used ones")
public boolean checkForNewPassword(List<String> prevPasswords,String password)
{
	return !prevPasswords.contains(password);
			
}
}
