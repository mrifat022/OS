/**
 * Created by DELL on 10/06/2015.
 */
public class Software {
    private String office;
    private String player;
    private String design;
    private String game;

    public Software(String office, String player, String design, String game) {
        this.office = office;
        this.player = player;
        this.design = design;
        this.game = game;
    }

    public Software(String office, String player, String design) {
        this.office = office;
        this.player = player;
        this.design = design;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Software{" +
                "office='" + office + '\'' +
                ", player='" + player + '\'' +
                ", design='" + design + '\'' +
                ", game='" + game + '\'' +
                '}';
    }
}
