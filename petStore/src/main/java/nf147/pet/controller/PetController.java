package nf147.pet.controller;


import nf147.pet.dao.PetMapper;
import nf147.pet.entity.Pet;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetMapper petMapper;


    //更新所有宠物
    @RequestMapping(method = RequestMethod.GET)
    public String getAllPet(Model model){
        List<Pet> list=petMapper.selectAll();
        model.addAttribute("petlist",list);
        return "main";
    }
    //跳转到添加宠物页面
    @RequestMapping(value = "/add")
    public String addPet(){
        return "add";
    }
    //添加宠物
    @RequestMapping(value = "/addpet",method = RequestMethod.POST)
    public String addPet(Pet pet){
        int num = petMapper.insert(pet);
        System.out.println(num);
        return "redirect:/pet";
    }

    //按照状态查找宠物
    @RequestMapping(value = "/queryByStatus/{petStatus}",method = RequestMethod.POST)
    public String queryPetByStatus(@Param("petStatus") String status, Model model){
        List<Pet> petList = petMapper.queryPetByStatus(status);
        model.addAttribute("perlist",petList);
        return "main";
    }
    //按照ID查找宠物
    @RequestMapping(value = "/queryPet/{id}",method = RequestMethod.GET)
    public String queryPetById(@PathVariable("id") int id){
        petMapper.selectByPrimaryKey(id);
        return "main";
    };

    //删除宠物
    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
    public ModelAndView deletePetById(@PathVariable("id") int id, Model m ){
        petMapper.deleteByPrimaryKey(id);
        return new ModelAndView("redirect:/pet");
    }
}
