/**
 * 
 */
package com.owlsearchengine.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.owlsearchengine.model.BasicSearch;
import com.owlsearchengine.model.SearchResults;

/**
 * @author sachin
 *
 */

@Controller
public class BasicSearchController  {
	
	   
	@RequestMapping(value = "/basicSearch", method = RequestMethod.POST)
	public String search(@ModelAttribute("basicSearch")BasicSearch basicSearch, 
	   ModelMap model,BindingResult result) {
		
		System.out.println(" post Method : basicSearch " );
		
		if(result.hasErrors()) {
			return "error";
		}
	      model.addAttribute("metadata", basicSearch.getMetadata());
	      model.addAttribute("knowledgeScope1", basicSearch.getKnowledgeScope1());
	      model.addAttribute("knowledgeScope2", basicSearch.getKnowledgeScope2());
	      model.addAttribute("knowledgeScope3", basicSearch.getKnowledgeScope3());
	      model.addAttribute("knowledgeScope4", basicSearch.getKnowledgeScope4());
	      model.addAttribute("variableOptions1", basicSearch.getVariableOptions1());
	      model.addAttribute("variableOptions2", basicSearch.getVariableOptions2());
	      model.addAttribute("variableOptions3", basicSearch.getVariableOptions3());
	      
	      return "searchResults";
	   }
	   

	protected Map metaData1() throws Exception {
		
		Map<String,String> metadata = new LinkedHashMap<String,String>();
		metadata.put("title", "Title");
		metadata.put("test1", "test1");
		metadata.put("test2", "Test2");
		metadata.put("test3", "Test3");
		
		return metadata;
	}

	protected Map knowledgeScope1() throws Exception {
	
		Map<String,String> knowledgeScope1 = new LinkedHashMap<String,String>();
		knowledgeScope1.put("journal", "Journal");
		knowledgeScope1.put("test1", "test1");
		knowledgeScope1.put("test2", "Test2");
		knowledgeScope1.put("test3", "Test3");
		
		return knowledgeScope1;
	}
	
	protected Map knowledgeScope2() throws Exception {
	
		Map<String,String> knowledgeScope2 = new LinkedHashMap<String,String>();
		knowledgeScope2.put("macroeconomics", "Macroeconomics");
		knowledgeScope2.put("test1", "test1");
		knowledgeScope2.put("test2", "Test2");
		knowledgeScope2.put("test3", "Test3");
		
		return knowledgeScope2;
	}
	
	protected Map knowledgeScope3() throws Exception {
	
		Map<String,String> knowledgeScope3 = new LinkedHashMap<String,String>();
		knowledgeScope3.put("economic geography", "Economic Geography");
		knowledgeScope3.put("test1", "test1");
		knowledgeScope3.put("test2", "Test2");
		knowledgeScope3.put("test3", "Test3");
		
		return knowledgeScope3;
	}
	protected Map knowledgeScope4() throws Exception {
		
		Map<String,String> knowledgeScope4 = new LinkedHashMap<String,String>();
		knowledgeScope4.put("econometrics", "Econometrics");
		knowledgeScope4.put("test1", "test1");
		knowledgeScope4.put("test2", "Test2");
		knowledgeScope4.put("test3", "Test3");
		
		return knowledgeScope4;
	}
	protected Map variableOptions1() throws Exception {
		
		Map<String,String> variableOptions1 = new LinkedHashMap<String,String>();
		variableOptions1.put("***inV/Dev***", "***InV/DeV***");
		variableOptions1.put("test1", "test1");
		variableOptions1.put("test2", "Test2");
		variableOptions1.put("test3", "Test3");
		
		return variableOptions1;
	}
	protected Map variableOptions2() throws Exception {
		
		Map<String,String> variableOptions2 = new LinkedHashMap<String,String>();
		variableOptions2.put("***variable***", "***Variable***");
		variableOptions2.put("test1", "test1");
		variableOptions2.put("test2", "Test2");
		variableOptions2.put("test3", "Test3");
		
		return variableOptions2;
	}
	protected Map variableOptions3() throws Exception {
	
		Map<String,String> variableOptions3 = new LinkedHashMap<String,String>();
		variableOptions3.put("topic", "***Topic***");
		variableOptions3.put("test1", "test1");
		variableOptions3.put("test2", "Test2");
		variableOptions3.put("test3", "Test3");
		
		return variableOptions3;
  }
	/**
	 * Retrieve Data from OWL file at startup here and populate the SelectBoxes
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	
	 @RequestMapping(value = "/basicSearch")
	    public String showBasicSearchForm(Model model) throws Exception {
		   System.out.println("showBasicSearch called");
		   model.addAttribute("metadata1",metaData1());
		   model.addAttribute("knowledgeScope1",knowledgeScope1());
		   model.addAttribute("knowledgeScope2",knowledgeScope2());
		   model.addAttribute("knowledgeScope3",knowledgeScope3());
		   model.addAttribute("knowledgeScope4",knowledgeScope4());
		   model.addAttribute("variableOptions1",variableOptions1());
		   model.addAttribute("variableOptions2",variableOptions2());
		   model.addAttribute("variableOptions3",variableOptions3());
		   model.addAttribute("result", "Testing");
		   model.addAttribute("description", "testing");   		   
		   model.addAttribute("basicSearch",new BasicSearch());
	       return "basicSearch";
	    }
	 

 	 @RequestMapping(value = "/searchResults") 	 
 	   public String showSearchResultsForm(Model model) throws Exception {
 		   System.out.println("showSearchResults called");
		   model.addAttribute("result", "Testing");
		   model.addAttribute("description", "testing");   
		   model.addAttribute("searchResults",new SearchResults());
		   
	       return "searchResults";
	    }
 	 
 	//@RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
 	@RequestMapping(value = "/searchResults", method = RequestMethod.POST)
	public String searchResults(@ModelAttribute("searchResults")SearchResults searchResults, 
	   ModelMap model,BindingResult result) {
		
		System.out.println(" post Method : searchResults " );
		
		if(result.hasErrors()) {
			return "error";
		}
	    model.addAttribute("result", searchResults.getResult());
	    model.addAttribute("description", searchResults.getDescription());
	   
	      return "searchResults";
	 }
	   
 	
}

