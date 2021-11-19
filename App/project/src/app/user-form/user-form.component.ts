import { Component} from '@angular/core';
import { ActivatedRoute,Router} from '@angular/router';
import { UserServiceService } from '../user-service.service';
import { User } from '../user';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent  {

  user: User;
  constructor(private route: ActivatedRoute, 
    private router: Router, 
      private userServiceService: UserServiceService) { 
        this.user=new User();
      }
      onSubmit() {
        this.userServiceService.save(this.user).subscribe(result => this.gotoUserList());
      }
    
      gotoUserList() {
        this.router.navigate(['/users']);
      }

}
