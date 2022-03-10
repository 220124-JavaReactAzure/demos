import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router';

import {Demo1} from './components/welcome/welcome';
import Add from './pages/addPlayerPage';
import PlayerListPage from './pages/playerListPage';
import Navbar from './components/nav/navbar';
import ParamPage from './pages/paramPage';

function App() {
  return (
    <div className = 'App'>
    <Navbar />
    <Routes>
      <Route path = "/" element = {<Demo1/>}/>
      <Route path = "/add" element = {<Add/>}/>
      <Route path = "/view" element = {<PlayerListPage/>}/>
      <Route path = "/number/:number" element= {<ParamPage/>}/>
    </Routes>
    </div>
  );
}

export default App;
