package db;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import business.Stuffy;

public class StuffyTextFile implements DAO<Stuffy>{

	private List<Stuffy> stuffies = null;
	private Path stuffiesPath = null;
	private File stuffiesFile = null;
	private final String FIELD_SEP = "\t";
	
	
	public StuffyTextFile() {
		stuffiesPath = Paths.get("stuffies.txt");
		stuffiesFile = stuffiesPath.toFile();
		stuffies = getAll();
	}

	@Override
	public Stuffy get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stuffy> getAll() {
		// if the stuffies file has already been read, don't read it again
		if (stuffies != null) {
			return stuffies;
		}
		
		stuffies = new ArrayList<>();
		if (Files.exists(stuffiesPath)) {
			// read the stuffies.txt file
			try (BufferedReader in = new BufferedReader(
									 new FileReader(stuffiesFile))) {
				// read stuffies from file into list
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split("\t");
					String idStr = fields[0];
					String type = fields[1];
					String color = fields[2];
					String size = fields[3];
					String limbsStr = fields[4];
					Stuffy s = new Stuffy(Integer.parseInt(idStr),
										  type, color, size,
										  Integer.parseInt(limbsStr));
					stuffies.add(s);
					line = in.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			System.out.println("creating Stuffies file!");
			try {
				Files.createFile(stuffiesPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return stuffies;
	}

	private boolean saveAll() {
		try (PrintWriter out = new PrintWriter(
							   new BufferedWriter(
							   new FileWriter(stuffiesFile)))) {
			//loop through stuffies and write each one to file
			for (Stuffy s: stuffies) {
				out.print(s.getId() + FIELD_SEP);
				out.print(s.getType() + FIELD_SEP);
				out.print(s.getColor() + FIELD_SEP);
				out.print(s.getSize() + FIELD_SEP);
				out.println(s.getLimbs());
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean add(Stuffy s) {
		stuffies.add(s);
		return saveAll();
	}

	@Override
	public boolean update(Stuffy t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Stuffy t) {
		// TODO Auto-generated method stub
		return false;
	}

}
