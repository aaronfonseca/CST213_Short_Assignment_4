import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("serial")
@SessionScoped
@ManagedBean 

public class answers implements Serializable {
	
	private String selection;
    private String gotoPage;

    
    public String Start() {
        if ( selection.equals("movies"))
            this.gotoPage = "moviesOne";
        else if ( selection.equals("games"))
            this.gotoPage = "gamesOne";
        
        return gotoPage;
    }
    
    public String Movies() {
        if ( selection.equals("action"))
            this.gotoPage = "moviesAction";
        else if ( selection.equals("comedy"))
            this.gotoPage = "moviesComedy";
        
        return gotoPage;
    }
    
    public String Action() {
        if ( selection.equals("martialArts"))
            this.gotoPage = "martialArts";
        else if ( selection.equals("explosion"))
            this.gotoPage = "explosion";
        
        return gotoPage;
    }
    
    public String MartialArts() {
        if ( selection.equals("bruceLee"))
            this.gotoPage = "bruceLee";
        else if ( selection.equals("jackieChan"))
            this.gotoPage = "jackieChan";
        
        return gotoPage;
    }
    
    public String Explosion() {
        if ( selection.equals("arnoldSchwarzenegger"))
            this.gotoPage = "arnold";
        else if ( selection.equals("theRock"))
            this.gotoPage = "rock";
        
        return gotoPage;
    }
    
    public String Comedy() {
        if ( selection.equals("satire"))
            this.gotoPage = "satire";
        else if ( selection.equals("slapstick"))
            this.gotoPage = "slapstick";
        
        return gotoPage;
    }
    
    public String Satire() {
        if ( selection.equals("british"))
            this.gotoPage = "british";
        else if ( selection.equals("american"))
            this.gotoPage = "american";
        
        return gotoPage;
    }
    
    public String Rating() {
        if ( selection.equals("everyone"))
            this.gotoPage = "everyone";
        if ( selection.equals("teen"))
            this.gotoPage = "teen";
        else if ( selection.equals("mature"))
            this.gotoPage = "mature";
        
        return gotoPage;
    }

    public String getSelection(){
    	return selection;
    }
    
    public void setSelection(String selection){
    	this.selection = selection;
    }

	public String getGotoPage() {
		return gotoPage;
	}

	public void setGotoPage(String gotoPage) {
		this.gotoPage = gotoPage;
	}

}
