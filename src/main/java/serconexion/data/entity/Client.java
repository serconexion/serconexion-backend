package serconexion.data.entity;

import java.sql.Date;
import java.util.UUID;

public class Client extends User{
    public Client(UUID idUser, String name, String lastName, int identificationDocument,
                  String email, String password, boolean enabled, String role, Date createdAt,
                  Date updatedAt, CreditCard card) {
        super(idUser, name, lastName, identificationDocument, email, password, enabled, role,
                createdAt, updatedAt);
        this.card = card;
    }

    private CreditCard card;

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }
}
