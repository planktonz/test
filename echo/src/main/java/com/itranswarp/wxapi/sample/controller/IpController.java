package com.itranswarp.wxapi.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itranswarp.wxapi.token.IpList;

@RestController
public class IpController extends AbstractController {

	@RequestMapping(value = "/ip", method = RequestMethod.GET)
	public IpList getIpList() {
		return client.getIpList();
	}
}
