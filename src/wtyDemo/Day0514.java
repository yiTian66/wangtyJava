package wtyDemo;

import javax.imageio.ImageIO;
import javax.print.*;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.attribute.standard.PrintQuality;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class Day0514 {

    public static void main(String[] args) {

    ifM1();
        System.out.println("===============================");
    ifM2();


        M3();
    }

    private static void M3() {

            try
            {
                DocFlavor dof = DocFlavor.INPUT_STREAM.GIF;

               // Barcode b = BarcodeFactory.createCode128("HOS18051100012222");

              //  BufferedImage bi = BarcodeImageHandler.getImage(b);
                ByteArrayOutputStream os = new ByteArrayOutputStream();
               // ImageIO.write(bi, "gif", os);
                InputStream is = new ByteArrayInputStream(os.toByteArray());

                PrintService ps = PrintServiceLookup.lookupDefaultPrintService();
                PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
                pras.add(OrientationRequested.PORTRAIT);
                pras.add(new Copies(1));
                pras.add(PrintQuality.HIGH);
                DocAttributeSet das = new HashDocAttributeSet();
                // 设置打印纸张的大小（以毫米为单位）
                das.add(new MediaPrintableArea(0, 0, 46, 30, MediaPrintableArea.MM));

                Doc doc = new SimpleDoc(is, dof, das);

                DocPrintJob job = ps.createPrintJob();

                job.print(doc, pras);
                is.close();

                //PrinterJob job = PrinterJob.getPrinterJob();
                //job.setPrintable(b);
                //if (job.printDialog())
                //{
                //    job.print();
                //}
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }

    private static void ifM1() {
        if(false)
        {
            System.out.println(1);
        }
        System.out.println(2);

    }

    private static void ifM2() {
        if (false)
        System.out.println(1);
        System.out.println(2);

    }
}
