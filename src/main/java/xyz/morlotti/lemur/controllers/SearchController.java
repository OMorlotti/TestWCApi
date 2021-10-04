package xyz.morlotti.lemur.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import xyz.morlotti.lemur.service.ArtistsService;
import xyz.morlotti.lemur.service.ArtworksService;

@Controller
public class SearchController
{
	@Autowired
	ArtistsService artistsService;

	@Autowired
	ArtworksService artworksService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String artists()
	{
		return "search";
	}
}