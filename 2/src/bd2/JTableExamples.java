package bd2;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
public class JTableExamples {
    // frame
    JFrame f;
    // Table
    JTable j;
 
    // Constructor
    JTableExamples()
    {
    	
         // Frame initialization
        f = new JFrame();
 
        // Frame Title
        f.setTitle("JTable Example");
        Daalgavar2 obj = new Daalgavar2();
        obj.setWeeks();
        obj.setWorkdays();
        int[] _1978 = new int[15];
        int[] _2006 = new int [16];
        int dadlaga1=(8+8+8+8+8+6)*8*60;
        int dadlaga2=(8+8+8+8+8)*8*60;
        int count = 0, count1 = 0, counter = 0, counter1 = 0;
 for (int i = 0; i < 15; i++) {
	 if (i>=0 && i<3) {
	_1978[i] = (int) obj.dund1_13(i);
	count += (int) obj.dund1_13(i);
	 }
	 if (i>=3 && i<8) {
			_1978[i] = (int) obj.dund1_48(i);
			count += (int) obj.dund1_48(i);
			 }
	 if (i>=8 && i<10) {
			_1978[i] = (int) obj.dund1_910(i);
			count += (int) obj.dund1_910(i);
			 }
	 if (i>=10 && i<15) {
			_1978[i] = (int) obj.ih1(i);
			count1 +=(int) obj.ih1(i);
			 }
	 
 }
 for (int i = 0; i < 16; i++) {
	 if (i>=0 && i<5) {
	_2006[i] = (int) obj.dund2_15(i);
	counter +=(int) obj.dund2_15(i);
	 }
	 if (i>=5 && i<12) {
	_2006[i] = (int) obj.dund2_612(i);
	counter += (int) obj.dund2_612(i);
	 }
	 if (i>=12 && i<16) {
			_2006[i] = (int) obj.ih2(i);
			counter1 += (int) obj.ih2(i);
			 }
 }
 double haritsaa =(double) count/(double)count1;
 double haritsaa1 =(double) counter/(double)counter1;
 int num = 0;
 for (int i = 0; i<10 ; i++) {
	 num += obj.sonirhson1(i);
 }
 int num1 = 0;
 for (int i = 0; i<12 ; i++) {
	 num1 += obj.sonirhson2(i);
 }
 int ihsur1_dad = dadlaga1*5;
 int ihsur2_dad = dadlaga2*4;
        // Data to be displayed in the JTable
        String[][] data = {
            {"1978","бага анги",""+String.valueOf(obj.getWorkDays(0)),"24","45",""+_1978[0],""+obj.getWeeks(0), ""+obj.sonirhson1(0),""},
            {"1979","бага анги",""+String.valueOf(obj.getWorkDays(1)),"24","45",""+_1978[1],""+obj.getWeeks(1), ""+obj.sonirhson1(1),""},
            {"1980","бага анги",""+String.valueOf(obj.getWorkDays(2)),"24","45",""+_1978[2],""+obj.getWeeks(2), ""+obj.sonirhson1(2),""},
            {"1981","дунд анги",""+String.valueOf(obj.getWorkDays(3)),"34","45",""+_1978[3],""+obj.getWeeks(3), ""+obj.sonirhson1(3),""},
            {"1982","дунд анги",""+String.valueOf(obj.getWorkDays(4)),"34","45",""+_1978[4],""+obj.getWeeks(4), ""+obj.sonirhson1(4),""},
            {"1983","дунд анги",""+String.valueOf(obj.getWorkDays(5)),"34","45",""+_1978[5],""+obj.getWeeks(5), ""+obj.sonirhson1(5),""},
            {"1984","дунд анги",""+String.valueOf(obj.getWorkDays(6)),"34","45",""+_1978[6],""+obj.getWeeks(6), ""+obj.sonirhson1(6),""},
            {"1985","дунд анги",""+String.valueOf(obj.getWorkDays(7)),"34","45",""+_1978[7],""+obj.getWeeks(7), ""+obj.sonirhson1(7),""},
            {"1986","ахлах анги",""+String.valueOf(obj.getWorkDays(8)),"36","45",""+_1978[8],""+obj.getWeeks(8), ""+obj.sonirhson1(8),""},
            {"1987","ахлах анги",""+String.valueOf(obj.getWorkDays(9)),"36","45",""+_1978[9],""+obj.getWeeks(9), ""+obj.sonirhson1(9),""},
            {"1988","дээд сургууль",""+String.valueOf(obj.getWorkDays(10)),"18","90",""+_1978[10],""+obj.getWeeks(10),"", ""+dadlaga1},
            {"1989","дээд сургууль",""+String.valueOf(obj.getWorkDays(11)),"18","90",""+_1978[11],""+obj.getWeeks(11),"", ""+dadlaga1},
            {"1990","дээд сургууль",""+String.valueOf(obj.getWorkDays(12)),"18","90",""+_1978[12],""+obj.getWeeks(12),"", ""+dadlaga1},
            {"1991","дээд сургууль",""+String.valueOf(obj.getWorkDays(13)),"18","90",""+_1978[13],""+obj.getWeeks(13),"", ""+dadlaga1},
            {"1992","дээд сургууль",""+String.valueOf(obj.getWorkDays(14)),"18","90",""+_1978[14],""+obj.getWeeks(14),"", ""+dadlaga1},  
            {"2006","бага анги",""+String.valueOf(obj.getWorkDays1(0)),"20","30",""+_2006[0],""+obj.getWeeks(0), ""+obj.sonirhson2(0),""},
            {"2007","бага анги",""+String.valueOf(obj.getWorkDays1(1)),"20","30",""+_2006[1],""+obj.getWeeks(1), ""+obj.sonirhson2(1),""},
            {"2008","бага анги",""+String.valueOf(obj.getWorkDays1(2)),"20","30",""+_2006[2],""+obj.getWeeks(2), ""+obj.sonirhson2(2),""},
            {"2009","бага анги",""+String.valueOf(obj.getWorkDays1(3)),"20","30",""+_2006[3],""+obj.getWeeks(3), ""+obj.sonirhson2(3),""},
            {"2010","бага анги",""+String.valueOf(obj.getWorkDays1(4)),"20","30",""+_2006[4],""+obj.getWeeks(4), ""+obj.sonirhson2(4),""},
            {"2011","ахлах анги",""+String.valueOf(obj.getWorkDays1(5)),"30","35",""+_2006[5],""+obj.getWeeks(5), ""+obj.sonirhson2(5),""},
            {"2012","ахлах анги",""+String.valueOf(obj.getWorkDays1(6)),"30","35",""+_2006[6],""+obj.getWeeks(6), ""+obj.sonirhson2(6),""},
            {"2013","ахлах анги",""+String.valueOf(obj.getWorkDays1(7)),"30","35",""+_2006[7],""+obj.getWeeks(7), ""+obj.sonirhson2(7),""},
            {"2014","ахлах анги",""+String.valueOf(obj.getWorkDays1(8)),"30","35",""+_2006[8],""+obj.getWeeks(8), ""+obj.sonirhson2(8),""},
            {"2015","ахлах анги",""+String.valueOf(obj.getWorkDays1(9)),"30","35",""+_2006[9],""+obj.getWeeks(9), ""+obj.sonirhson2(9),""},
            {"2016","ахлах анги",""+String.valueOf(obj.getWorkDays1(10)),"30","35",""+_2006[10],""+obj.getWeeks(10), ""+obj.sonirhson2(10),""},
            {"2017","ахлах анги",""+String.valueOf(obj.getWorkDays1(11)),"30","35",""+_2006[11],""+obj.getWeeks(11), ""+obj.sonirhson2(11),""},
            {"2018","дээд сургууль",""+String.valueOf(obj.getWorkDays1(12)),"15","90",""+_2006[12],""+obj.getWeeks(12),"", ""+dadlaga2},
            {"2019","дээд сургууль",""+String.valueOf(obj.getWorkDays1(13)),"15","90",""+_2006[13],""+obj.getWeeks(13),"", ""+dadlaga2},
            {"2020","дээд сургууль",""+String.valueOf(obj.getWorkDays1(14)),"15","90",""+_2006[14],""+obj.getWeeks(14),"", ""+dadlaga2},
            {"2021","дээд сургууль",""+String.valueOf(obj.getWorkDays1(15)),"15","90",""+_2006[15],""+obj.getWeeks(15),"", ""+dadlaga2},
            {"1р тохиолдолд дунд сургууль","1р тохиолдолд дээд сургууль","2р тохиолдолд дунд сургууль","2р тохиолдолд дээд сургууль","1р харьцаа","2р харьцаа","", "",""},
            {""+count,""+count1,""+counter,""+counter1,""+String.valueOf(haritsaa),""+String.valueOf(haritsaa1),"", "",""},
            {"1р тохиолдолд сонирхсон","2р тохиолдолд сонирхсон","Харьцаа","1р тохиолдолд нийт дадлага","2р тохиолдолд нийт дадлага/Дээд сургуульд сурсан хугацаа","2р тохиолдолд нийт дадлага", "2р тохиолдолд нийт дадлага/Дээд сургуульд сурсан хугацаа","",""},
            {""+num,""+num1,""+(double) num/num1,""+ihsur1_dad,""+(double) ihsur1_dad/count1*100+"%",""+ihsur2_dad, ""+(double) ihsur2_dad/counter1*100+"%","",""},
                    };
 
        // Column Names
        String[] columnNames = { "он", "төлөв","Хичээлийн өдөр","7 хоногт орох цаг","нэг цаг үргэлжлэх хугацаа","нийт(минут)" ,"Бүтэн 7 хоногийн тоо","Сонирхсон хичээл", "Дадлага"};
 
        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
 
    // Driver  method
    public static void main(String[] args)
    {
        new JTableExamples();
    }
}
//19:22

