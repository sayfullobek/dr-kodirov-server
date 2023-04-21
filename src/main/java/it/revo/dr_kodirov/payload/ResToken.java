package it.revo.dr_kodirov.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResToken {
    private String body;
    private String tokenType="Bearer ";

    public ResToken(String body) {
        this.body = body;
    }
}
