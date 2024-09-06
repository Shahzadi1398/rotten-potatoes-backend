package rottenpotatobackend.payload.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignupRequest {
    private String username;
    private String email;
    private Set<String> role;
    private String password;
}
