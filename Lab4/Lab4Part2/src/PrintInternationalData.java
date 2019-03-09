import java.util.*;
import java.text.*;

public class PrintInternationalData
{
	public static void main(String[] args)
	{
		double milk = 2.50;
		Locale lce[] =
		{
			new Locale("es","ES"),
			new Locale("ru","RU"),
			new Locale("de","DE")
		};
		DateFormat dft[] =
		{
			DateFormat.getDateInstance(DateFormat.LONG, lce[0]),
			DateFormat.getDateInstance(DateFormat.LONG, lce[1]),
			DateFormat.getDateInstance(DateFormat.LONG, lce[2])
		};
		DateFormatSymbols dfs[] =
		{
			new DateFormatSymbols(lce[0]),
			new DateFormatSymbols(lce[1]),
			new DateFormatSymbols(lce[2])
		};
		String weekdays[][] =
		{
			dfs[0].getWeekdays(),
			dfs[1].getWeekdays(),
			dfs[2].getWeekdays()
		};
		NumberFormat nft[] =
		{
			NumberFormat.getCurrencyInstance(lce[0]),
			NumberFormat.getCurrencyInstance(lce[1]),
			NumberFormat.getCurrencyInstance(lce[2])
		};
		for(int i = 0; i < 3; i++)
		{
			System.out.println(dft[i].format(new Date()));
			System.out.println(nft[i].format(milk));
			for(int j = 1; j <= 7; j++)
			{
				System.out.println(weekdays[i][j]);
			}
			System.out.println("\n");
		}
	}

}
