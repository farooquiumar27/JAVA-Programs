import java.awt.*;
import java.awt.event.*;
class awt11 extends Frame
{
private MenuBar mb;
private TextArea ta;

private Menu menuFile;
private MenuItem menuItemNew;
private MenuItem menuItemOpen;
private MenuItem menuItemSave;

private Menu menuEdit;
private MenuItem menuItemCut;
private MenuItem menuItemCopy;
private MenuItem menuItemPaste;

private Menu menuFormat;
private MenuItem menuItemWordWrap;
private MenuItem menuItemFont;

private Menu menuView;
private Menu menuZoom;
private MenuItem menuItemZoomIn;
private MenuItem menuItemZoomOut;
private MenuItem menuItemStatus;

private Menu menuHelp;
private MenuItem menuItemAbout;
private MenuItem menuItemHelp;

awt11( )
{
super("Looks Like Notepad");
menuFile=new Menu("File");
menuItemNew=new MenuItem("New");
menuItemOpen=new MenuItem("Open");
menuItemSave=new MenuItem("Save");
menuFile.add(menuItemNew);
menuFile.add(menuItemOpen);
menuFile.add(menuItemSave);

menuEdit=new Menu("Edit");
menuItemCut=new MenuItem("Cut");
menuItemCopy=new MenuItem("Copy");
menuItemPaste=new MenuItem("Paste");
menuEdit.add(menuItemCut);
menuEdit.add(menuItemCopy);
menuEdit.add(menuItemPaste);

menuFormat=new Menu("Format");
menuItemWordWrap=new MenuItem("Word Wrap");
menuItemFont=new MenuItem("Font");
menuFormat.add(menuItemWordWrap); 
menuFormat.add(menuItemFont); 

menuView=new Menu("Viem");
menuZoom=new Menu("Zoom");
menuItemZoomIn=new MenuItem("ZoomIn");
menuItemZoomOut=new MenuItem("ZoomOut");
menuItemStatus=new MenuItem("Status");
menuZoom.add(menuItemZoomIn);
menuZoom.add(menuItemZoomOut);
menuView.add(menuZoom);
menuView.add(menuItemStatus);

menuHelp=new Menu("Help");
menuItemAbout=new MenuItem("About");
menuItemHelp=new MenuItem("Help");
menuHelp.add(menuItemAbout);
menuHelp.add(menuItemHelp);

mb=new MenuBar( );
mb.add(menuFile);
mb.add(menuEdit);
mb.add(menuFormat);
mb.add(menuView);
mb.add(menuHelp);

ta=new TextArea( );

setLayout(new BorderLayout( ));
setMenuBar(mb);
add(ta);
setLocation(100,100);
setSize(600,600);
setVisible(true);
}
};
class main
{
public static void main(String gg[ ])
{
awt11 a=new awt11( );
}
};