package it.revo.dr_kodirov.payload;

import it.revo.dr_kodirov.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetLogin {
    private User user;
    private ResToken resToken;
}
