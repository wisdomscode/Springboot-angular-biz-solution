package servbyte.com.businesshub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import servbyte.com.businesshub.model.Menu;
import servbyte.com.businesshub.repository.MenuRepository;

import java.util.List;

@Service
public class MenuService {
    final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public Menu addMenu(Menu menu) {
        menu.setId(menu.getId());
        return menuRepository.save(menu);
    }

    public List<Menu> findAllMenus() {
        return menuRepository.findAll();
    }

    public Menu updateMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu findMenuById(Integer id) {
        return menuRepository.findMenuById(id);
    }
}
