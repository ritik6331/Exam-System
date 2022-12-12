import React from 'react';
import { stack as Menu } from 'react-burger-menu';
import './Sidebar.css';

import { FcIdea } from "react-icons/fc";
import { CgCardHearts, CgFileAdd } from "react-icons/cg";
import Logo from ".//logo.jpg"


const props = () => {
  return (
      <Menu width={'80px'} customBurgerIcon={ <img src={Logo} /> } >
      <a className="bm-item" href="/ideas">
        <FcIdea style={{"fontSize":"30px"}} />
        <div>Fresh Ideas</div>
      </a>

      <a className="bm-item" href="/AddB">
        <CgFileAdd color='rgba(103, 192, 103, 0.75)' style={{"fontSize":"30px"}} />
        <div>Add Idea</div>
      </a>

      <a className="bm-item" href="/myFavorites">
        <CgCardHearts color='rgb(181, 72, 72)' style={{"fontSize":"30px"}} />
        <div>My Favorites</div>
      </a>
     
    </Menu>
  );
};

export default props;