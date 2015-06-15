/**
 * 
 */
package com.jitworks.shareinfo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.jitworks.shareinfo.data.Blog;
import com.jitworks.shareinfo.data.BlogSummary;
import com.jitworks.shareinfo.data.BlogTopic;
import com.jitworks.shareinfo.data.User;

/**
 * @author j.paidimarla
 *
 */
@Controller
@RequestMapping("/{employerName}/files")
//@SessionAttributes(types = Filemanager.class)
public class FileAppController {

/*	@ModelAttribute("blogTopics")
	public Collection<BlogTopic> populateCarriers() {
		return this.blogService.getBlogTopics();
	}

	@ModelAttribute("blogUser")
	public User populateBlogUser(@PathVariable("userId") int userId) {
		return this.userService.getUser(userId);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getBlogs(@ModelAttribute("user") User user, @PathVariable("userId") int userId, Model model) {
		if (user == null) {
			logger.error("user is null");
			return "redirect:/users";
		}

		logger.debug("get Blog Topics for Authenticated userID : " + user.getId());
		logger.info("get Blog Topics for  user ID  : " + userId);
		// User blogUser = userService.getUser(userId);
		List<BlogSummary> blogs = blogService.getBlogsByTopic(userId, null, 0);
		model.addAttribute("blogs", blogs);
		// model.addAttribute("blogUser", blogUser);
		return "blogs/userBlogsView";
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String getAllBlogs(@ModelAttribute("user") User user, @PathVariable("userId") int userId, Model model) {
		if (user == null) {
			logger.error("user is null");
			return "redirect:/users";
		}

		logger.debug("get Blog Topics of all users for Authenticated userID : " + user.getFirstName());
		boolean viewAllBlogs = true;
		List<BlogSummary> blogs = blogService.getBlogsByTopic(null, null, 0);
		model.addAttribute("blogs", blogs);
		model.addAttribute("viewAllBlogs", viewAllBlogs);
		return "blogs/userBlogsView";
	}

	*/
}
