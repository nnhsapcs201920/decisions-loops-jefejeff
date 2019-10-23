import java.util.Scanner;

public class Spectrum
{
    public static void Spectrum()
    {
        System.out.println("Please input the wavelength of the wave:");
        
        Scanner kabob = new Scanner(System.in);
        
        double w = kabob.nextDouble();
       
        if(w>1e-1)
        {
            System.out.println("Radio Waves, wavelength is less than 1e-1 m, frequency is less than 3e9 hz");
        }
        else if(w > 1e-3 && w < 1e-1)
        {
            System.out.println("Microwaves, wavelength is between 1e–3 and 1e–1 m, frequency is between 3e9 and 3e11 hz");
        }
        else if(w > 7e-7 && w < 1e-3)
        {
            System.out.println("Infrared, wavelength is between 7e–7 and 1e–3 m, frequency is between 3e11 and 4e14 hz");
        }
        else if(w > 4e-7 && w < 7e-7)
        {
            System.out.println("Visible light, wavelength is between 4e–7 and 4e–7 m, frequency is between 4e14 and 7.5e14 hz");
        }
        else if(w > 1e-8 && w < 4e-7)
        {
            System.out.println("Ultraviolet, wavelength is between 1e-8 and 4e–7 m, frequency is between 7.5e14 and 3e16 hz");
        }
        else if(w > 1e-11 && w < 1e-8)
        {
            System.out.println("Xrays, wavelength is between 1e-11 and 1e-8 m, frequency is between 3e16 and 3e19 hz");
        }
        else if(w < 1e-1)
        {
            System.out.println("Gamma rays, wavelength is less than 1e-11 m, frequency is greater than 3e19 hz");
        }
    }
}