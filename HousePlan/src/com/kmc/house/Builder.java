package com.kmc.house;

public class Builder {
		public static void main(String[] args)
		{
			HouseBuilder iglooBuilder = new IglooHouseBuilder();
			CivilEngineer engineer = new CivilEngineer(iglooBuilder);
			new CivilEngineer(iglooBuilder);
			House house = engineer.getHouse();
			System.out.println("Builder constructed: "+ house);

		}
		
}