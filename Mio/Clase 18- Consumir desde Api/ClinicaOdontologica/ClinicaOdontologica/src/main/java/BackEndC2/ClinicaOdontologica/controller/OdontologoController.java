package BackEndC2.ClinicaOdontologica.controller;

import BackEndC2.ClinicaOdontologica.model.Odontologo;
import BackEndC2.ClinicaOdontologica.service.OdontologoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/odontologos")
public class  OdontologoController {
    private OdontologoService odontologoService;

    public OdontologoController() {
        odontologoService= new OdontologoService();
    }
    @PostMapping
    public Odontologo registrarUnOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.guardarOdontologo(odontologo);
    }
    @GetMapping("/{id}")
    public Odontologo buscarOdontologoPorId(@PathVariable Integer id){
        return odontologoService.buscarPorId(id);
    }
}
