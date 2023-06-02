package br.senac.sp.epictask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.senac.sp.epictask.Model.Tarefa;
import br.sp.senac.epicktask.data.TarefaRepository;

@Controller
public class TarefaController{

    @Autowired 
    TarefaRepository repository;

    @GetMapping("/tarefa")
    public String tarefa(Model model) {
        var tarefas = repository.findAll();
        model.addAttribute("tarefas", tarefas);
        return "tarefa";
    }

    @GetMapping("/tarefas/cadastrar")
    public String formulario(){
        return "formulario_tarefa";
    }
    
    @PostMapping("/tarefa")
    public String cadastrar(Tarefa tarefa){
        repository.save(tarefa);
        return "redirect:/tarefas";
    }

    @DeleteMapping("/tarefas")
    public String apagar(Long id, RedirectAttributes redirect){
        repository.deleteById(id);
        redirect.addFlashAttribute("mensagem", "Tarefa apagada com sucesso!!");
        return "redirect: /tarefas";
    }
    @GetMapping("/")
    public String home(){
        return "redirect:/tarefas";
    }

}
