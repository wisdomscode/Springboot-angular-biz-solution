package servbyte.com.businesshub;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import servbyte.com.businesshub.model.Menu;
import servbyte.com.businesshub.service.MenuService;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuResource {
    private final MenuService menuService ;

    public MenuResource(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Menu>> getAllMenu() {
        List<Menu> menu = menuService.findAllMenus();
        return new ResponseEntity<>(menu, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable("id") Integer id) {
        Menu menu = menuService.findMenuById(id);
        return new ResponseEntity<>(menu, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Menu> addMenu(@RequestBody Menu menu) {
        Menu newMenu = menuService.addMenu(menu);
        return new ResponseEntity<>(newMenu, HttpStatus.CREATED);
    }


}
