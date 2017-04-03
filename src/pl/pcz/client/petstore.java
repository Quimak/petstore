package pl.pcz.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.TextBox;

public class petstore implements EntryPoint {
    
    private Label lid = new Label("ID: ");
    private TextBox tbid = new TextBox();
    private Label lname = new Label("Name: ");
    private TextBox tbname = new TextBox();
    private Label lcategory = new Label("Category: ");
    private TextBox tbcategory = new TextBox();

    public void onModuleLoad() {
	// Heading
	VerticalPanel vp = new VerticalPanel();
	HorizontalPanel hp = new HorizontalPanel();
	Label lheading = new Label("PetStore");
	vp.add(lheading);

	// Content		

	// Left side
	
	FlexTable ft = new FlexTable();
	ft.setText(0,0,"12345");
	ft.setText(0,1,"Slot");
	hp.add(ft);
	
	// Right side
	
	VerticalPanel vpin = new VerticalPanel();
	HorizontalPanel hpin1 = new HorizontalPanel();
	hpin1.add(lid);
	hpin1.add(tbid);
	HorizontalPanel hpin2 = new HorizontalPanel();
	hpin2.add(lname);
	hpin2.add(tbname);
	HorizontalPanel hpin3 = new HorizontalPanel();
	hpin3.add(lcategory);
	hpin3.add(tbcategory);
	
	vpin.add(hpin1);
	vpin.add(hpin2);
	vpin.add(hpin3);
	hp.add(vpin);

	// Add Content to Body
	vp.add(hp);

	// Footer
	FlowPanel fp = new FlowPanel();
	Label kontakt = new Label("Kontakt:");
	Anchor a = new Anchor("office@petstore.pcz.pl");
	fp.add(kontakt);
	fp.add(a);
	vp.add(fp);

	// Add all to body
	RootPanel.get().add(vp);
  }
}
