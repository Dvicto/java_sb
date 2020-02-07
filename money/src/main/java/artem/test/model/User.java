package artem.test.model;

import com.sun.istack.internal.NotNull;
import org.springframework.lang.NonNull;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @Column(name = "name")
    private String name;

    @NonNull
    @Column(name = "nick")
    private String nick;

    @NonNull
    @Column(name = "money")
    private int money;

    @NonNull
    @Column(name = "coin")
    private int coin;

    public User(int id, String name, String nick, int money, int coin){
        this.name = name;
        this.id = id;
        this.nick = nick;
        this.money = money;
        this.coin = coin;
    }

    public User(){

    }

    public int getId() {
        return id;
    }

    public int getCoin() {
        return coin;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nick=" + nick +
                ", money='" + money + '\'' +
                ", coin=" + coin +
                '}';
    }
}
