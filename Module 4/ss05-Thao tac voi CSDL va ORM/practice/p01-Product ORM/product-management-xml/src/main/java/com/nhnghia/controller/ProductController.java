package com.nhnghia.controller;

import com.nhnghia.entity.Product;
import com.nhnghia.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/")
    public String listAll(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);

        return "index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());

        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        if (productService.findById(product.getId()) == null) {
            redirectAttributes.addFlashAttribute("success", "Add new product successfully");
        } else {
            redirectAttributes.addFlashAttribute("success", "Update product successfully");
        }
        productService.save(product);

        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.findById(id));

        return "create";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id, RedirectAttributes redirectAttributes) {
        productService.delete(id);
        redirectAttributes.addFlashAttribute("success", "Remove product successfully");

        return "redirect:/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.findById(id));

        return "view";
    }

}
