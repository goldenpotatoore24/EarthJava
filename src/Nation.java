import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

public class Nation {
    private main game;
    private String name;
    private Province provinces[] = new Province[0];
    private Company stateCompany;
    private Character nationLeader;
    private Province capital;
    private ArrayList<Company> companies = new ArrayList<Company>();

    public Nation(main game, String name, Character nationLeader) {
        this.game = game;
        this.name = name;
        this.nationLeader = nationLeader;
        game.nationArrayPush(this);
        stateCompany = new Company(nationLeader, name + " State Company", this);

    }

    public Province[] getProvinces() {
        return provinces;
    }

    public main getGame() {
        return game;
    }

    public Character getLeader() {
        return nationLeader;
    }

    public Company getStateCompany() {
        return stateCompany;
    }

    public void addCompany(Company input)
    {
        companies.add(input);
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public void provinceArrayPush(Province input)
    {
        Province[] newArr = new Province[provinces.length + 1];
        for(int i = 0; i < provinces.length; i++)
        {
            newArr[i] = provinces[i];
        }
        newArr[newArr.length - 1] = input;
        provinces = newArr;
        if(provinces.length < 2)
        {
            capital = input;
        }
    }

}
