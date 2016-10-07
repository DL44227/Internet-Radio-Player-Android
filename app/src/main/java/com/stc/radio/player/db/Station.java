package com.stc.radio.player.db;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by artem on 9/21/16.
 */
@Table(name = "Stations", id = "_id")
public class Station extends Model {
	@Column(name = "Name")
	public String name;
	@Column(name = "Url", unique = true, index = true, notNull = true)
	public String url;
	@Column(name = "PlaylistId", notNull = true)
	public long playlistId;
	@Column(name = "Favorite")
	public boolean favorite;
	@Column(name = "Active")
	public boolean active;
	@Column(name = "Position")
	public int position;


	@Column(name = "Art")
	public int art;


	public Station(String url, String name, long playlistId) {
		this.url = url;
		this.name = name;
		this.playlistId = playlistId;
		this.active = false;
		this.favorite = false;
		this.position = -1;

	}


	public Station() {
	}
}