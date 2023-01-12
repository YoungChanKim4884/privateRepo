package com.kh.erp.ad.stats;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.authenticator.DigestAuthenticator.DigestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kh.erp.ad.notice.NoticeDAO;
import com.kh.erp.ad.notice.NoticeDTO;
import com.kh.erp.ad.notice.NoticeSearchDTO;
import com.kh.erp.ad.notice.NoticeService;
import com.kh.erp.ad.notice.Util;
import com.kh.erp.ad.sal.AdSalDAO;
import com.kh.erp.ad.sal.AmpaymentDTO;
import com.kh.erp.login.InfoDTO;
import com.kh.erp.login.LoginDAO;

@Controller
public class StatsController {

}