package Api.edu.fatecpg.model;

import com.google.gson.annotations.SerializedName;

public class Cliente {
    @SerializedName("name")
    private String nome;
    @SerializedName("email")
    private String email;
}
